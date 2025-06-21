public class OperatorTypeCasting {

        public static void main(String[] args) {

            int a = 5, b = 3, c = 4;
            int expressionResult = a + b * c;
            expressionResult += 6;
            System.out.println("Expression result: " + expressionResult);

            int intVal = 13;
            double implicit = intVal + 0.5;
            System.out.println("Implicit casting: " + implicit);

            double doubleVal = 13.9;
            int explicit = (int) doubleVal;
            System.out.println("Explicit casting: " + explicit);
        }
    }
