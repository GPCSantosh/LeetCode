/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* swapNodes(ListNode* head, int k) {
        ListNode *first = head, *last = head, *cur = head;
        for(int i = 1 ; i < k ; i++){
            first = first->next;
        }
        cur = first;
        while(cur->next != NULL){
            cur = cur->next;
            last = last->next;
        }
        int temp = first->val;
        first->val = last->val;
        last->val = temp;
        return head;
    }
};