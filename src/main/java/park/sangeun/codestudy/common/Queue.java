package park.sangeun.codestudy.common;

public interface Queue<E> {
    boolean offer(E data); // 큐에 데이터 insert
    E peek(); // 큐의 첫번째를 반환 (삭제X)
    E poll(); // 큐의 첫번째를 삭제하고 반환
}
