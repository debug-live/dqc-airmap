package biz.globalvillage.oper.param.net;

import com.globalvillage.bg.common.dto.mall.MallOrderDTO;

public class NetOrderSyncUpdateParam {

    private MallOrderDTO orderDto;

    public MallOrderDTO getOrderDto() {
        return orderDto;
    }

    public void setOrderDto(MallOrderDTO orderDto) {
        this.orderDto = orderDto;
    }
}
