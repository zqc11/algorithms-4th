public class ResizingArrayQueueOfStrings<Item>{
  private Item[] a;
  private n;
  private first;
  private last;
  
  public ResizingArrayQueueOfStrings(int size){
    a = new Item(size);  
  }
  
  public int size(){
    return n + 1;
  }
  
  public boolean isEmpty(){
    return n == 0;  
  }
  
  public void enqueue(Item item){
    if (n == a.len()){
      StdOut.println('overflow');
      return;
    }
    a[++n] = item;
  }
  
  public Item dequeue(){
    if(n==-1){
      thows IllegalException;
    }
    Item deq = a[0];
    for(int i = 0;i < n;i++){
      a[i] = a[i + 1];
    }
    n--;
    return deq;
  }
  
  
}
