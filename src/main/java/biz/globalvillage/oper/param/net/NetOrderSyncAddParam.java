package biz.globalvillage.oper.param.net;

import com.globalvillage.bg.common.dto.mall.MallOrderDTO;
import com.globalvillage.bg.common.mybatis.entity.mall.MallOrderGoods;

import java.util.List;

public class NetOrderSyncAddParam {

    private MallOrderDTO order;

    private List<MallOrderGoods> goodsList;

    public MallOrderDTO getOrder() {
        return order;
    }

    public void setOrder(MallOrderDTO order) {
        this.order = order;
    }

    public List<MallOrderGoods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<MallOrderGoods> goodsList) {
        this.goodsList = goodsList;
    }
}
