package shopping.order.service;

import shopping.order.dto.OrderRequest;
import shopping.order.dto.OrderResponse;

public interface OrderService {

    OrderResponse createOrder (OrderRequest orderRequest);

    OrderResponse getOrderById (String orderId);

    OrderResponse updateOrder (String orderId, OrderRequest orderRequest);


}
