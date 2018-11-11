package CauTrucDuLieu.Queue.Demerging;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Demerging <E>{
    public static void main(String[] args) throws ParseException {
        LinkedList<QuanLyNhanSu> list= new LinkedList<>();
        list.addLast(new QuanLyNhanSu("Sang","20/5/1999","nam"));
        list.addLast(new QuanLyNhanSu("Loc","23/5/1999","nam"));
        list.addLast(new QuanLyNhanSu("Van","24/5/1999","nam"));
        list.addLast(new QuanLyNhanSu("Son","25/5/1999","nam"));
        list.addLast(new QuanLyNhanSu("Dung","26/5/1999","nu"));
        list.addLast(new QuanLyNhanSu("Tam","27/5/1999","nu"));
        list.addLast(new QuanLyNhanSu("Thư","28/5/1999","nu"));
        list.addLast(new QuanLyNhanSu("Hoang","29/5/1999","nam"));

        LinkedList<Date> dateLinkedList= new LinkedList<>();
        LinkedList<SimpleDateFormat> simpleDateFormats= new LinkedList<>();
        for (int i = 0; i <list.size() ; i++) {
            String string= list.get(i).getDate();
            simpleDateFormats.addFirst(new SimpleDateFormat("dd/MM/yyyy"));
            dateLinkedList.add(simpleDateFormats.getFirst().parse(string));
        }
        System.out.println(dateLinkedList);
        Collections.sort(dateLinkedList);
        for (int i = 0; i <dateLinkedList.size() ; i++) {
            System.out.println(dateLinkedList.get(i));
        }
        for (int i = 0; i <list.size() ; i++) {
            list.get(i).setDate1(dateLinkedList.get(i));
        }
        System.out.println("=======sau khi sắp xếp ngày tháng năm sinh");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        Queue<QuanLyNhanSu> nam = new ArrayDeque<>();
        Queue<QuanLyNhanSu> nu= new ArrayDeque<>();

        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).getSex()=="nam"){
                nam.add(list.get(i));
            }else nu.add(list.get(i));
        }
        System.out.println("======sau khi sắp xếp giới tính và ngày tháng năm sinh");
        while (!nam.isEmpty()){
            System.out.println(nam.poll());
        }
        while (!nu.isEmpty()){
            System.out.println(nu.poll());
        }

    }


}
