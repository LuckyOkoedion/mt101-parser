package com.aikhomu_okoedion.dto.types;

public enum MT101_ContentOptions {
    SIXTEEN_X("16x"),
    C_OR_L("C or L"),
    FGH("F, G, or H"),
    AC("A or C"),
    COMPLEX("[/1!a][/34x]<crlf>4!a2!a2!c[3!c]"),
    SIX_N("6!n"),
    THIRTY_FIVE_X("35x"),
    FOUR_C_THIRTY_X("4!c[/30x]"),

    THREE_ONE_FIVE_D("3!a15d"),

    ACD("A, C, or D"),

    NONE_OR_AF("No letter option, A, or F"),

    FOUR_THIRTY_FIVE_X("4*35x"),

    THREE_THIRTY_FIVE_X("3*35x"),

    THREE_A_FIFTEEN_D("3!a15d"),
    THREE_A("3!a"),
    OPTIONAL_THIRTY_FOUR_X("/34x"),

    TWELVE_D("12d"),
    FIVE_N_OVER_N("5n/5n");


    private String value;

    MT101_ContentOptions(String s) {

        value = s;
    }

    public String getValue() {
        return value;
    }
}
