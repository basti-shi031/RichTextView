package com.basti.richtextviewlibrary;

/**
 * 文本类
 * Created by SHIBW-PC on 2016/1/8.
 */
public class TextObject {

    private int mStartIndex;//样式的开始字符
    private int mEndIndex;//结束字符
    //private SpannableStringBuilder mSpannableStringBuilder;
    private String content;//文本内容
    private int mOptionType;//操作符
    private int color;//字体颜色
    private boolean isUnderline;//是否有下划线
    //...其他需要的属性可继承TextObject自行添加


    public boolean isUnderline() {
        return isUnderline;
    }

    public void setIsUnderline(boolean isUnderline) {
        this.isUnderline = isUnderline;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public TextObject(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private OnMultiActionClickListener mOnMultiActionClickLisntener;

    public int getmOptionType() {
        return mOptionType;
    }

    public void setmOptionType(int mOptionType) {
        this.mOptionType = mOptionType;
    }

    public int getmStartIndex() {
        return mStartIndex;
    }

    public void setmStartIndex(int mStartIndex) {
        this.mStartIndex = mStartIndex;
    }

    public int getmEndIndex() {
        return mEndIndex;
    }

    public void setmEndIndex(int mEndIndex) {
        this.mEndIndex = mEndIndex;
    }

    public OnMultiActionClickListener getmOnMultiActionClickLisntener() {
        return mOnMultiActionClickLisntener;
    }

    public void setmOnMultiActionClickLisntener(OnMultiActionClickListener mOnMultiActionClickLisntener) {
        this.mOnMultiActionClickLisntener = mOnMultiActionClickLisntener;
    }
}
