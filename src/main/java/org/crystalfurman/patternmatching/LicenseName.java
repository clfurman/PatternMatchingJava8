package org.crystalfurman.patternmatching;

public class LicenseName 
{
    private String fullName;
    private String nickname;
    
    public LicenseName (String fn, String nn)
    {
        fullName = fn;
        nickname = nn;
    }
    
    public String getfullName() { return fullName; }
    public String getnickname() { return nickname; }
}
   