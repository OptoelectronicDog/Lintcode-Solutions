ArrayList

Constructor

ArrayList()
ArrayList(Collection c)
ArrayList(int capacity)

Method

void add(int index, Object element): Throws IndexOutOfBoundsException if the specified index is out of range (index < 0 || index > size())
boolean add(Object): Appends to the end of list.
boolean addAll(Collection c): Throws NullPointerException, if the specified collection is null.
boolean addAll(int index, Collection c): Throws NullPointerException, if the specified collection is null.
void clear()
Object clone(): Shallow copy
boolean contains(Object o): returns true if and only if this list contains at least one element e such that (o==null ? e==null : o.equals(e)).
Object remove(int index): Throws IndexOutOfBoundsException if the index out is of range (index < 0 || index >= size()).
Object set(int index, Object element): Throws IndexOutOfBoundsException if the specified index is out of range (index < 0 || index >= size()).
int size()
Map

mapclasshierarchy-600x354

Key-Value pair.
Implementation: HashMap, TreeMap, LinkedHashMap

HashMap is implemented as a hash table, and there is no ordering on keys or values.
TreeMap is implemented based on red-black tree structure, and it is ordered by the key.
LinkedHashMap preserves the insertion order
Hashtable is synchronized, in contrast to HashMap. It has an overhead for synchronization.
Common Exceptions:

NoSuchElementException

ClassCastException: incompatible with the elements in the map.

NullPointerException

UnsupportedOperationException

Methods

boolean add(Object obj)
boolean addAll(Collection c)
boolean contains(Object obj)
boolean containsAll(Collection c)
boolean equals(Object obj)
boolean isEmpty()
boolean size()

HashMap

CONSTRUCTOR

HashMap()
HashMap(Map m)
HashMap(int capacity)
HashMap(int capacity, float fillRatio)

METHODS

boolean containsKey(Object key)
boolean containsValue(Object value)
Set entrySet(): Map.Entry type
Set keySet(): a set of the keys in this map
Object put(Object key, Object value)
putAll(Map m)

Set

Implementation: AbstractSet, EnumSet, HashSet, LinkedHashSet, TreeSet, ConcurrentSkipListSet
Commonly used:
HashSet: based on hash table
TreeSet: TreeMap to store elements. sorted by comparator.

HashSet

CONSTRUCTOR

HashSet()
HashSet(Collection c)
HashSet(int intialCapacity)
HashSet(int intialCapacity, float loadFactor)

METHODS

add(Object): Adds a new element, if it does not exist already.
addAll(Collection): Adds all the elements of the given collection, if the do not exist already. If the given collection is also a set, then the execution of the method results in the union of the two sets.
contains(Object): Returns true if the elements given exists in the set.
containsAll(Collection): Returns true if all the elements in the given collection exist in the set. In case the given collection is a set, the method return true if it is a subset of this set.
equals(Object): Returns true if the given object that is compared with this set is also a set, both of them contain the same number of elements and every element of the given set is contained in this set.
size(): Returns the number of the elements in the set.
remove(Object): Removes the specified elements from the set.
removeAll(Collection): Removes from the set all the elements that the collection contains.
clear(): Removes all the elements from the set, resulting in an empty set.
isEmpty(): Returns true if the set has no elements.
toArray(): Return an array containing all the elements of this set.
Iterator iterator()

 

Stack and Queue

ArrayDeque

METHODS:

int size()
boolean isEmpety()
boolean contains(Object o)
Iterator iterator

For Stack:
void push(E e)
E pop()

For Queue:
boolean offer(E e): inserts at the end of queue
E poll(): remove the head of the queue
E peek(): return the head of the queue
