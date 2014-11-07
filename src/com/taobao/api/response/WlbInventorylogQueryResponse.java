package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.WlbItemInventoryLog;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.inventorylog.query response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbInventorylogQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4425211287487286367L;

	/** 
	 * �������¼�б�
	 */
	@ApiListField("inventory_log_list")
	@ApiField("wlb_item_inventory_log")
	private List<WlbItemInventoryLog> inventoryLogList;

	/** 
	 * ��¼��
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setInventoryLogList(List<WlbItemInventoryLog> inventoryLogList) {
		this.inventoryLogList = inventoryLogList;
	}
	public List<WlbItemInventoryLog> getInventoryLogList( ) {
		return this.inventoryLogList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
