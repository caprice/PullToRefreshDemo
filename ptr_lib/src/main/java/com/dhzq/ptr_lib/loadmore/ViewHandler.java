package com.dhzq.ptr_lib.loadmore;

import android.view.View;
import android.view.View.OnClickListener;


public interface ViewHandler {

	/**
	 * 
	 * @param contentView
	 * @param loadMoreView
	 * @param onClickLoadMoreListener
	 * @return 是否有 init ILoadMoreView
	 */
	public boolean handleSetAdapter(View contentView, ILoadViewMoreFactory.ILoadMoreView loadMoreView, OnClickListener onClickLoadMoreListener);

	public void setOnScrollBottomListener(View contentView, OnScrollBottomListener onScrollBottomListener);

}
