package park.sangeun.codestudy.common;


/* List 형태의 데이터 구조의 기초*/
public interface List<E> {
    /** @apiNote 처음에 데이터를 추가함. */
    void addFirst(E data);

    /** @apiNote 특정 위치에 데이터를 추가함. 뒤는 하나씩 밀림 */
    void add(E data);

    void add(int index, E data);

    /** @apiNote 특정 위치의 데이터를 가져옴. */
    E get(int index);

    /** @apiNote 특정 데이터를 입력 데이터로 변경 */
    void set(int index, E data);

    /** @apiNote 특정 위치의 데이터를 제거. 뒤는 하나씩 당겨짐 */
    void remove(int index);

    /** @apiNote 특정 데이터를 제거. 뒤는 하나씩 당겨짐 */
    void remove(E data);

    /** @apiNote 전체 리스트를 제거 */
    void removeAll();

    /** @apiNote 포함 여부를 확인 */
    boolean contain(E data);

    /** @apiNote 리스트 사이즈를 반환 */
    int size();
}
