package com.basti.richtextviewlibrary;

import android.text.SpannableStringBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * 每个TextView中显示的内容
 * Created by SHIBW-PC on 2016/1/8.
 */
public class Content {

    private List<TextObject> mList;

    private SpannableStringBuilder mSpannableStringBuilder;

    public SpannableStringBuilder getmSpannableStringBuilder() {
        return mSpannableStringBuilder;
    }

    public void setmSpannableStringBuilder(SpannableStringBuilder mSpannableStringBuilder) {
        this.mSpannableStringBuilder = mSpannableStringBuilder;
    }

    public List<TextObject> getmList() {
        if (mList== null){
            mList = new ArrayList<>();
        }

        return mList;
    }

    public void setmList(List<TextObject> mList) {
        this.mList = mList;
    }

    //拼接SpannableStringBuilder
    public void initStringBuilder(){

        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0;i<mList.size();i++){
            spannableStringBuilder.append(mList.get(i).getContent());
        }
        setmSpannableStringBuilder(spannableStringBuilder);
    }
}
