package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * �Ի���Ʒ�б�
 *
 * @author auto create
 * @since 1.0, 2011-01-21 12:48:36.0
 */
public class TaohuaSearchItems extends TaobaoObject {

	private static final long serialVersionUID = 4217265775382815826L;

	/**
	 * �Ի���Ŀ·�����ݽṹ
	 */
	@ApiListField("cate_paths")
	@ApiField("taohua_category")
	private List<TaohuaCategory> catePaths;

	/**
	 * ��������������������е���һ����Ŀͳ�Ƴ�������Ŀ�б�
	 */
	@ApiListField("cate_stats")
	@ApiField("taohua_cate_stat")
	private List<TaohuaCateStat> cateStats;

	/**
	 * �Ի�������Ʒ�����б����ݽṹ
	 */
	@ApiListField("taohua_search_items")
	@ApiField("taohua_search_item")
	private List<TaohuaSearchItem> taohuaSearchItems;

	/**
	 * ������������Ʒ����
	 */
	@ApiField("total_item")
	private Long totalItem;

	public List<TaohuaCategory> getCatePaths() {
		return this.catePaths;
	}
	public void setCatePaths(List<TaohuaCategory> catePaths) {
		this.catePaths = catePaths;
	}

	public List<TaohuaCateStat> getCateStats() {
		return this.cateStats;
	}
	public void setCateStats(List<TaohuaCateStat> cateStats) {
		this.cateStats = cateStats;
	}

	public List<TaohuaSearchItem> getTaohuaSearchItems() {
		return this.taohuaSearchItems;
	}
	public void setTaohuaSearchItems(List<TaohuaSearchItem> taohuaSearchItems) {
		this.taohuaSearchItems = taohuaSearchItems;
	}

	public Long getTotalItem() {
		return this.totalItem;
	}
	public void setTotalItem(Long totalItem) {
		this.totalItem = totalItem;
	}

}
