class MinStack {
        ArrayList<Integer> stackMain;
        ArrayList<Integer> stackMin;

        public MinStack() {
            this.stackMain = new ArrayList<>();
            this.stackMin = new ArrayList<>();
        }

        public void push(int val) {

            stackMain.add(val);

            if (stackMin.isEmpty() || val <= stackMin.getLast()) {
                stackMin.add(val);
            }
        }

        public void pop() {
            if(stackMain.isEmpty()) return;
            int popItem = stackMain.removeLast();

            if(popItem == stackMin.getLast()){
                stackMin.removeLast();
            }
        }

        public int top() {
           return stackMain.getLast();
        }

        
        public int getMin() {
            return stackMin.getLast();
        }
    }
/**
Explicação / Explanation
Versão em Português / Portuguese Version

Vamos utilizar duas ArrayLists, uma para armazenar a Stack principal(stackMain) e outra para armazenar o valor mínimo encontrado dentro da Stack principal(stackMin);
Só será adiconado um novo valor à stackMin, se o proximo valor for menor que o atual.

Exemplo:

stackMain = [5,3,7,9,2,1];

Será adicionada à stackMin primeiramente o numero 5 pois é o menor:
stackMain = [5,3,7,9,2,1];
..stackMin = [5];

Após isso será adicionado o número 3, pois é menor que o elemento atual:
stackMain = [5,3,7,9,2,1];
..stackMin = [5,3];

O valor 3 será mantido pois ele é o menor na stack até o momento:
stackMain = [5,3,7,9,2,1];
..stackMin = [5,3];

E novamente:
stackMain = [5,3,7,9,2,1];
..stackMin = [5,3];

Agora será adicionado o numero 2 pois é o menor encontrado até agora:
stackMain = [5,3,7,9,2,1];
..stackMin = [5,3,2];

E por fim o 1:
stackMain = [5,3,7,9,2,1];
..stackMin = [5,3,2,1];

Agora, ao dar o pop(), vamos ver o que acontece:

stackMain = [5,3,7,9,2];
..stackMin = [5,3,2];
Perceba que o ultimo elemento foi popado de ambas as Stacks, vamo popar de novo:

stackMain = [5,3,7,9];
..stackMin = [5,3]
Veja que agora sempre que o ultimo valor da stackMin for retornado, esse valor sempre será o mínimo da Stack, pois o valor da stackMin só será popado se: o último valor da stackMain for igual o último valor da stackMin, então se dermos mais um pop, só será removido o último valor da stackMain
English Version / Versão em Inglês:

We will use two ArrayLists, one to store the Main Stack(stackMain), and the other to store the minimum value inside the Main Stack (stackMin); An element will be added in the Min Stack, only if the value is less or equal the current value.

Example:

stackMain = [5,3,7,9,2,1];

Will be added into stackMin the number 5 because its the smaller value:
stackMain = [5,3,7,9,2,1];
..stackMin = [5];

After this, the number 3 will be added because its smaller than the current value:
stackMain = [5,3,7,9,2,1];
..stackMin = [5,3];

Now, the number 3 will remain beacause its the smaller value in the Stack until now:
stackMain = [5,3,7,9,2,1];
..stackMin = [5,3];

And again:
stackMain = [5,3,7,9,2,1];
..stackMin = [5,3];

Now, the number 2 will be added, because its smaller than the current number:
stackMain = [5,3,7,9,2,1];
..stackMin = [5,3,2];

And finnaly 1:
stackMain = [5,3,7,9,2,1];
..stackMin = [5,3,2,1];

Now lets pop(), and see what happens:

stackMain = [5,3,7,9,2];
..stackMin = [5,3,2];
See that the last element was poped from both Stacks, lets pop again:

stackMain = [5,3,7,9];
..stackMin = [5,3];
Realize that, now, every time that we return the last element from stackMin, this value will always be the smallest number in the Stack because the "stackMin" will be poped only if the last number in the Main Stack, matches with the last number in the Min Stack.
Abordagem / Approach

ArrayList
Complexidade / Complexity

    Time complexity:
    O(1)

    Space complexity:
    O(n)


*/
