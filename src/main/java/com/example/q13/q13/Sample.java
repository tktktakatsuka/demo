package com.example.q13.q13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Sample {
    public static void main(String[] args) {
        // 言語コード、国コードの順番でインスタンス生成
        Locale l = new Locale("en", "US");

        LocalDate today = LocalDate.of(2021, 4, 1);
        // FormatStyleの列挙子でフォーマットタイプを指定 MEDIUMの場合は Apr 1, 2021
        String mToday0 = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(l));
        // FormatStyleの列挙子でフォーマットタイプを指定 MEDIUMの場合は Apr 1, 2021
        String mToday = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(l));
        // FormatStyleの列挙子でフォーマットタイプを指定、SHORTは 4/1/21
        String mToday2 = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(l));

        System.out.println(mToday0);
    }
}
