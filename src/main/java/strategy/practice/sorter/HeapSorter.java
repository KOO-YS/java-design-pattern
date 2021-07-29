package strategy.practice.sorter;

public class HeapSorter implements Sorter{
    @Override
    public void sort(Comparable[] data) {
        int size = data.length;

        // 힙 높이가 N일떄, i는 N-1 레벨에서 오른쪽으로 부터 가장 먼저 자식이 있는 노드를 선택
        int i = size/2 - 1;
        while(i >= 0) {
            heapify(data, i--, size);   
        }

        for(int j=size-1; j>=0; j--) {
            swap(data, 0, j);
            heapify(data, 0, j);
        }
    }

    private void heapify(Comparable[] data, int i, int size) {
        // 왼쪽,오른쪽 자식 노드
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<size && data[left].compareTo(data[i])>0) { // 자식 노드가 부모 노드보다 값이 크면
            swap(data, i, left);     // 값 교환
        }
        if(right<size && data[right].compareTo(data[i])>0) { // 자식 노드가 부모 노드보다 값이 크면
            swap(data, i, right);     // 값 교환
        }
    }

    private void swap(Comparable[] data, int i, int left) {
        Comparable temp = data[i];
        data[i] = data[left];
        data[left] = temp;
    }
}
