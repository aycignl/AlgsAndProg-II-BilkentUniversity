package lecture6;

public enum Season {
    
    winter ("December through February"),
    spring ("March through May"),
    summer ("June through August"),
    fall ("September through November");
    
    private String span;
    
    Season (String months){
        
        span = months;
    }
    
    // Returns the span message for this value.
    
    public String getSpan(){
        return span;
        
        
    }
}
