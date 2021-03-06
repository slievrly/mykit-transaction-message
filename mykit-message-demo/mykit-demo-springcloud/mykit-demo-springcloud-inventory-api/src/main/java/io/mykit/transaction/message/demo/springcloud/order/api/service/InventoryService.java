/**
 * Copyright 2020-9999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mykit.transaction.message.demo.springcloud.order.api.service;

import io.mykit.transaction.message.demo.springcloud.order.api.dto.InventoryDto;
import io.mykit.transaction.message.demo.springcloud.order.api.entity.InventoryDo;

/**
 * @author binghe
 * @version 1.0.0
 * @description InventoryService
 */
public interface InventoryService {

    /**
     * 扣减库存操作
     * 这一个tcc接口
     *
     * @param inventoryDto 库存DTO对象
     * @return true
     */
    Boolean decrease(InventoryDto inventoryDto);


    /**
     * 获取商品库存信息
     *
     * @param productId 商品id
     * @return InventoryDO
     */
    InventoryDo findByProductId(String productId);

}
