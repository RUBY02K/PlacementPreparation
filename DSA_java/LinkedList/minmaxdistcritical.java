class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        int minDist = Integer.MAX_VALUE;
        int maxDist = 0;
        
        int first = -1;
        int last = -1;
        int index = 1;
        
        ListNode prev = head;
        ListNode curr = head.next;
        
        while (curr.next != null) {
            
            ListNode next = curr.next;
            
            if ((curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val)) {
                
                // first critical point
                if (first == -1) {
                    first = index;
                } else {
                    // distance from previous critical point
                    minDist = Math.min(minDist, index - last);
                    
                    // distance from first critical point
                    maxDist = Math.max(maxDist, index - first);
                }
                
                last = index;
            }
            
            prev = curr;
            curr = next;
            index++;
        }
        
        if (first == -1 || first == last) {
            return new int[]{-1, -1};
        }
        
        return new int[]{minDist, maxDist};
    }
}