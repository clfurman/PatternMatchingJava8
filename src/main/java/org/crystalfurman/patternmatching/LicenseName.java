package org.crystalfurman.patternmatching;

public class LicenseName {

    private final String fullName;
    private final String nickname;

    public LicenseName(String fn, String nn) {
        fullName = fn;
        nickname = nn;
    }

    public String getfullName() {
        return fullName;
    }

    public String getnickname() {
        return nickname;
    }
}
