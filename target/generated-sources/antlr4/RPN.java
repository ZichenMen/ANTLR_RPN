import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Scanner;

public class RPN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression;

        System.out.println("Enter an infix expression (or type 'quit' to exit):");

        while (!(expression = scanner.nextLine()).equalsIgnoreCase("quit")) {
            if (expression.isEmpty()) {
                System.out.println("Enter an infix expression (or type 'quit' to exit):");
                continue;
            }

            // Set up the lexer and parser for the input expression
            MathOperationsLexer lexer = new MathOperationsLexer(CharStreams.fromString(expression));
            MathOperationsParser parser = new MathOperationsParser(new CommonTokenStream(lexer));

            // Parse the expression to generate the parse tree
            ParseTree tree = parser.prog(); // 'prog' is the actual starting rule here

            // Walk the parse tree with the RPNListener
            ParseTreeWalker walker = new ParseTreeWalker();
            RPNListener listener = new RPNListener();
            walker.walk(listener, tree);

            // Get the RPN expression from the listener
            String rpnExpression = listener.getRPNExpression();

            // Evaluate the RPN expression
            double result = RPNEvaluator.evaluate(rpnExpression);

            // Format and output the result as specified, with no trailing zeros
            String formattedResult = formatResult(result);

            // Output the original infix expression, the RPN expression, and the computation result
            System.out.println("Infix Expression: " + expression);
            System.out.println("RPN Expression: " + rpnExpression);
            System.out.println("Computation Result: " + formattedResult);

            System.out.println("Enter another infix expression (or type 'quit' to exit):");
        }

        scanner.close();
    }

    private static String formatResult(double result) {
        if (result == (long) result) {
            return String.format("%d", (long) result);
        } else {
            return String.format("%.5f", result).replaceAll("0*$", "").replaceAll("\\.$", "");
        }
    }
    
}
