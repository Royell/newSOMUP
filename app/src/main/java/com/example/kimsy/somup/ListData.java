package com.example.kimsy.somup;

import android.graphics.drawable.Drawable;

import java.text.Collator;
import java.util.Comparator;

public class ListData {
    //리스트 정보를 담고 있을 객체
    //아이콘
    public Drawable mIcon;

    //제목
    public String mTitle;

    // 날짜
    public String mDate;

    /**
     * 알파벳 이름으로 정렬 -> 실험용 / 나중에 없애도 상관 없음
     */
    public static final Comparator<ListData> ALPHA_COMPARATOR = new Comparator<ListData>() {
        private final Collator sCollator = Collator.getInstance();

        @Override
        public int compare(ListData mListDate_1, ListData mListDate_2) {
            return sCollator.compare(mListDate_1.mTitle, mListDate_2.mTitle);
        }
    };
}
