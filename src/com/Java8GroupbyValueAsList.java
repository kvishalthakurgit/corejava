package com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8GroupbyValueAsList {
    private Long productId;
    private Long userId;

    public Java8GroupbyValueAsList(Long productId, Long userId) {
        this.productId = productId;
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public Long getUserId() {
        return userId;
    }

    public static void main(String[] args) {
        // Sample interactions
        List<Java8GroupbyValueAsList> productUserInteractions = Arrays.asList(
                new Java8GroupbyValueAsList(1L, 101L),
                new Java8GroupbyValueAsList(1L, 102L),
                new Java8GroupbyValueAsList(2L, 103L),
                new Java8GroupbyValueAsList(2L, 104L),
                new Java8GroupbyValueAsList(1L, 105L)
        );

        // Query to group interactions by product ID and collect user IDs in a list
        Map<Long, List<Long>> productUsersMap = productUserInteractions.stream().collect(
                Collectors.groupingBy(
                        Java8GroupbyValueAsList::getProductId,
                        Collectors.mapping(Java8GroupbyValueAsList::getUserId, Collectors.toList())
                )
        );
        
        productUserInteractions.stream().collect(
        		Collectors.groupingBy(obj->obj.getProductId(),Collectors.mapping(obj->obj.getUserId(), Collectors.toList()))
        		);

        // Display the result
        productUsersMap.forEach((productId, userIds) -> {
            System.out.println("Product ID: " + productId + ", Users: " + userIds);
        });
    }
}

