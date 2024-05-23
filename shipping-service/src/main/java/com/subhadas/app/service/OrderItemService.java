package com.subhadas.app.service;

import java.util.List;

import com.subhadas.app.domain.id.OrderItemId;
import com.subhadas.app.dto.OrderItemDto;

public interface OrderItemService {
	
	List<OrderItemDto> findAll();
	OrderItemDto findById(final OrderItemId orderItemId);
	OrderItemDto save(final OrderItemDto orderItemDto);
	OrderItemDto update(final OrderItemDto orderItemDto);
	void deleteById(final OrderItemId orderItemId);
	
}
