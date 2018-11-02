
package week7.task1;

public class Addition extends BinaryExpression{
    Expression left ;
    Expression right ;
    public Addition(Expression left, Expression right){
        this.left = left ;
        this.right = right ;
        
    }
    public int Addition(){
        return left.evaluate() + right.evaluate() ;
    }
    
    
}
