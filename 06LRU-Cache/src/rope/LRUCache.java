package rope;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private DoublyLinkedList pageList;
    private final int cacheSize;
    private Map<Integer, Node> pageMap;

    public LRUCache(int cacheSize){
        this.cacheSize = cacheSize;
        pageList = new DoublyLinkedList(cacheSize);
        pageMap = new HashMap<>();
    }


    public void accessPage(int pageNumber){
        Node pageNode = null;
        if(pageMap.containsKey(pageNumber)){
            pageNode = pageMap.get(pageNumber);
            pageList.movePageToHead(pageNode);
        }if(pageList.getCurrSize() == pageList.getSize()){
            pageMap.remove(pageNumber);
        }
        pageNode = pageList.addToList(pageNumber);
        pageMap.put(pageNumber,pageNode);
    }

    public void printCacheState(){
        pageList.printList();
    }


    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(5);
        lruCache.accessPage(5);
       // lruCache.printCacheState();
        lruCache.accessPage(10);
        lruCache.accessPage(15);
        lruCache.accessPage(25);
        lruCache.accessPage(22);
        lruCache.accessPage(21);
        lruCache.printCacheState();
    }

}
