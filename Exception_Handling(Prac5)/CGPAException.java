public class CGPAException extends Exception{
    float f;
    CGPAException(float cgpa){
        f = cgpa;
    }
    public String toString(){
        return "Invalid CGPA"+f+"\n";
    }
}