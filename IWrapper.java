public interface IWrapper {
    String getHashCode();
    void compare(Wrapper wrapper) throws LesserThanException, GreaterThanException;    
}