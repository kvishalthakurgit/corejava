package com.apporchid.c1v.rest.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import com.apporchid.c1v.model.v1.AmiHourlyAndDailyUsage;
import com.apporchid.c1v.model.v1.BillCycle;
import com.apporchid.c1v.model.v1.MeterConsumption;
import com.apporchid.c1v.model.v1.MeterDetails;
import com.apporchid.c1v.model.v1.MeterUsage;
import com.apporchid.c1v.rest.AMIResource;
import com.apporchid.c1v.service.AMIservice;

/**
 * @author RH0166
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = AMIResource.class, secure = false)
public class AMIResourceTest {
	private MockMvc mockMvc;

	@InjectMocks
	private AMIResource amiResource;

	@Mock
	private AMIservice amiService;

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(amiResource)
				.setHandlerExceptionResolvers(new ExceptionHandlerExceptionResolver()).build();
	}

	/**
	 * @ Test successful status response.
	 */
	@Test
	public void testHourlyAndDailyConsumptionStatusOK() throws Exception {
		List<AmiHourlyAndDailyUsage> hourlyUsageList = populateDailyConsumption();
		Mockito.when(amiService.getHourlyAndDailyConsumption("1101139003", "01-01-2018", null, null, null))
				.thenReturn(hourlyUsageList);
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.get("/customer/consumption/" + 1101139003 + "?startDate=01-01-2018");
		mockMvc.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse();
	}
	
	/**
	 * @Test when data not available for given BPN.
	 */
	@Test
	public void testGetHourlyAndDailyConsumptionStatusNotFound() throws Exception {
		List<AmiHourlyAndDailyUsage> hourlyUsageList = new ArrayList<>();
		Mockito.when(amiService.getHourlyAndDailyConsumption("1101139003", "01-01-2018", null, null, null))
				.thenReturn(hourlyUsageList);
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.get("/customer/consumption/" + 1101139003 + "?startDate=01-01-2018");
		mockMvc.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isNotFound()).andReturn().getResponse();
	}
	
	/**
	 * @ Test Usage Projection Successfully Response code.
	 */
	@Test
	public void testGetUsagePredectionStatusOk() throws Exception {
		List<MeterUsage> populateUsagePredectionList = populateUsagePredection();
		Mockito.when(amiService.getUsagePredection("1101741713","210020289468"))
				.thenReturn(populateUsagePredectionList);
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.get("/customer/" + 1101741713 + "/usagePredection");
		mockMvc.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isNotFound()).andReturn().getResponse();
	}
	
	/**
	 * @ Test when no usage prediction available for given BPN
	 */
	@Test
	public void testGetUsagePredictionStatusDataNotFound() throws Exception {
		List<MeterUsage> populateUsagePredectionList = new ArrayList<>();
		Mockito.when(amiService.getUsagePredection("1101741713", "210020289468"))
				.thenReturn(populateUsagePredectionList);
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.get("/customer/" + 1101741713 + "/usagePredection");
		mockMvc.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isNotFound()).andReturn().getResponse();
	}
	
	/**
	 * @ Test Hourly Consumption successful response code.
	 */
	@Test
	//@Ignore
	public void testHourlyConsumptionStatusOk() throws Exception {
		List<AmiHourlyAndDailyUsage> hourlyUsageList = populateDailyConsumption();
		Mockito.when(amiService.getHourlyConsumption("1101139003", "14-08-2018"))
				.thenReturn(hourlyUsageList);
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.get("/customer/hourlyConsumption/"+1101139003+ "?givenDate=14-08-2018");
		mockMvc.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse();
	}
	
	/**
	 * @ Test Daily Consumption successful response code.
	 */
	@Test
	public void testDailyConsumptionStatusOk() throws Exception {
		List<AmiHourlyAndDailyUsage> hourlyUsageList = populateDailyConsumption();
		Mockito.when(amiService.getDailyConsumption("1101139003", "02-01-2018", null))
				.thenReturn(hourlyUsageList);
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.get("/customer/dailyConsumption/" + 1101139003 + "?startDate=02-01-2018");
		mockMvc.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse();
	}

	/**
	 * @ Test Hourly Consumption Data Not Found response code.
	 */
	@Test
	public void testHourlyConsumptionStatusNotFound() throws Exception {
		List<AmiHourlyAndDailyUsage> hourlyUsageList = new ArrayList<>();
		Mockito.when(amiService.getHourlyConsumption("1101139003","01-01-2019"))
				.thenReturn(hourlyUsageList);
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.get("/customer/hourlyConsumption/"+1101139003);
		mockMvc.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isNotFound()).andReturn().getResponse();
	}
	
	/**
	 * @ Test Daily Consumption Data Not Found response code.
	 */
	@Test
	public void testDailyConsumptionStatusNotFound() throws Exception {
		List<AmiHourlyAndDailyUsage> hourlyUsageList = new ArrayList<>();
		Mockito.when(amiService.getDailyConsumption("1101139003", "01-01-2018", null))
				.thenReturn(hourlyUsageList);
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.get("/customer/dailyConsumption/" + 1101139003 + "?startDate=01-01-2018");
		mockMvc.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isNotFound()).andReturn().getResponse();
	}

	/**
	 * @ Test Bill Cycle successful response code
	 */
	@Test
	public void testBillCyclesStatusOk() throws Exception {
		 List<BillCycle> populateBillCycles = populateBillCycles();
		Mockito.when(amiService.getBillCycles("1101139003"))
				.thenReturn(populateBillCycles);
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.get("/customer/" + 1101139003 + "/currentBillingCycle");
		mockMvc.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse();
	}
	
	private List<BillCycle> populateBillCycles(){
		List<BillCycle> billCycles = new ArrayList<>();
		BillCycle billCycle = new BillCycle();
		billCycle.setBillingCycleEndDate("2018-06-15");
		billCycle.setBillingCycleStartDate("2018-05-15");
		billCycle.setBusinessPartnerNumber("1101139003");
		billCycle.setConnectionContractNumber("210020289468");
		billCycle.setDaysPassed(15);
		billCycle.setDaysRemaining(15);
		billCycles.add(billCycle);
		return billCycles;
	} 
	
	private List<AmiHourlyAndDailyUsage> populateDailyConsumption() {
		List<AmiHourlyAndDailyUsage> amiHourlyUsagesList = new ArrayList<>();

		AmiHourlyAndDailyUsage amiHourlyUsage = new AmiHourlyAndDailyUsage();
		amiHourlyUsage.setConnectionContractNumber("210020289468");
		amiHourlyUsage.setCustomerNumber("1101741713");
		amiHourlyUsage.setPremiseId("9050158462");
		amiHourlyUsage.setMeters(populateMeterDetails());

		amiHourlyUsagesList.add(amiHourlyUsage);
		return amiHourlyUsagesList;
	}

	private List<MeterDetails> populateMeterDetails() {
		List<MeterDetails> meterDetailsList = new ArrayList<>();
		MeterDetails meterDetails = new MeterDetails();
		meterDetails.setMeterId("54399672");
		meterDetails.setMeterConsumption(populateMeterConsumption());
		meterDetailsList.add(meterDetails);
		return meterDetailsList;
	}

	private List<MeterConsumption> populateMeterConsumption() {
		List<MeterConsumption> mtrConList = new ArrayList<>();

		MeterConsumption meterConsumption = new MeterConsumption();
		meterConsumption.setConsumption(12.68);
		meterConsumption.setReadingDatetime("2018-06-17 14:00:00");
		meterConsumption.setUnitOfMeasure("Gals.");

		MeterConsumption meterConsumption1 = new MeterConsumption();
		meterConsumption1.setConsumption(0.05);
		meterConsumption1.setReadingDatetime("2018-06-17 15:00:00");
		meterConsumption1.setUnitOfMeasure("Gals.");

		mtrConList.add(meterConsumption);
		mtrConList.add(meterConsumption1);
		return mtrConList;
	}
	
	private List<MeterUsage> populateUsagePredection() {
		List<MeterUsage> currentUsageList = new ArrayList<>();
		MeterUsage mtrUsg = new MeterUsage();
		mtrUsg.setConnectionContractNumber("220006066055");
		mtrUsg.setDaysToNextCycle(6.0);
		mtrUsg.setMeterId("54400259");
		mtrUsg.setPremiseId("9050166359");
		mtrUsg.setServicePeriodEnd(new Date(2018-06-20));
		mtrUsg.setServicePeriodStart(new Date(2018-04-19));
		mtrUsg.setUsage(8536);
		mtrUsg.setUsageUnits("Gallons");
		
		currentUsageList.add(mtrUsg);
		return currentUsageList;
	}
}
