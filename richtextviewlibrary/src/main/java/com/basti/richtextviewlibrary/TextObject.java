package com.basti.richtextviewlibrary;

/**
 * 文本类
 * Created by SHIBW-PC on 2016/1/8.
 */
public class TextObject {

    private int mStartIndex;
    private int mEndIndex;
    //private SpannableStringBuilder mSpannableStringBuilder;
    private String content;
    private int mOptionType;

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
