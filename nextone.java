public class nextone {
    public static void main(String[] args) {
        String n = Reversing("Бочка дегтя ложка меда");
        System.out.println(n);
    }
    public static String Reversing (String s){
        StringBuilder sb = new StringBuilder();
        int end = s.length()-1; //Индекс последнего элемента
        while(end>=0){//просто идем по индексам элементам
            if (s.charAt(end)==' '){ // если там пробел = другое слово
                end-=1;// индекс двигаем дальше влево
                continue;
            }
            int start = end-1; //индекс старта = конечный минус1, то есть 1 эл разница
            while(start>=0 && s.charAt(start)!=' '){ //пока он не отрицательный и не пробел
                start-=1;//двигайся 
            }
            sb.append(' '); 
            sb.append(s.substring(start+1, end+1)); //Возвращаемся к слову, добавляем его Берем отдельный кусок на вывод
            end = start-1;//меняем местами конец и перехожим к другому слову
        }
        if(sb.length()>0){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
