import java.util.*;
class Node{
    int data;
    int i;
    int j;
    Node(int data,int row,int col){
        this.data=data;
        i=row;
        j=col;
    }
}
class  Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][] arr=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        PriorityQueue<Node> pq=new PriorityQueue<>(new Comparator<Node>(){
            public int compare(Node a,Node b){
                return a.data-b.data;
            }
        });
        for(int i=0;i<a;i++){
            Node temp=new Node(arr[i][0],i,0);
            pq.add(temp);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(pq.size()>0){
            Node curr=pq.poll();
            ans.add(curr.data);
            int i=curr.i;
            int j=curr.j;
            if(j+1<arr[i].length){
                Node next=new Node(arr[i][j+1],i,j+1);
                pq.add(next);
            }
        }
        for(int num:ans){
            System.out.print(num+" ");
        }
    }
}