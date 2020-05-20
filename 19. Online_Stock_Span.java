class StockSpanner {
    
    LinkedList<Integer> prices;
    LinkedList<Integer> weight;    

    public StockSpanner() {
        prices = new LinkedList();
        weight = new LinkedList();
    }
    
    public int next(int price) {
        int count = 1;
        
        while(!prices.isEmpty() && price >= prices.getLast()){
            prices.removeLast();
            count += weight.removeLast();
        }
        prices.add(price);
        weight.add(count);
        
        return count;
    }
}


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
