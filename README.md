**基于[chrisbanes/Android-PullToRefresh](https://github.com/chrisbanes/Android-PullToRefresh)做的修改**

给[PullToRefreshScrollView](https://github.com/flueky/Android-PullToRefresh/blob/studio/library/src/com/handmark/pulltorefresh/library/PullToRefreshScrollView.java)添加变化标题头功能,类似于QQ空间。效果如下：

![](Screenshot/changetop.gif=200x650)


```java
    /**
     * 注册监听
     */
    public void setScrollStateListener(ScrollStateListener scrollStateListener) {
        mScrollStateListener = scrollStateListener;
    }


    /**
     * 添加标题视图
     */
    public void setTitleView(View titleView) {
        this.titleView = titleView;

    }
    /**
     * 添加头部视图
     */
    public void setHeadView(View headView) {
        this.headView = headView;
    }
    
    /**
     * 滚动状态监听
     */
    public interface ScrollStateListener {
        /**
         * 滑动时调用，获取头部显示百分比
         */
        public void openPercent(float openPercent);
        /**
         * 头部消失、显示变化时调用
         */
        public void changed(boolean isOpen);
    }
```

头部视图，通常放置图片。通过监听头部显示百分比，变更标题背景。


