//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * The interface which all syntax tree classes must implement.
 */
public interface Node extends java.io.Serializable {
   public void accept(visitor.Visitor v);
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu);
   public <R> R accept(visitor.GJNoArguVisitor<R> v);
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu);
}

