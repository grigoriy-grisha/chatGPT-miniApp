package com.chatgpt.entity.responses;

public class OrderChangeResponse {
    int order_id;

    public OrderChangeResponse(int order_id) {
        this.order_id = order_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
}
