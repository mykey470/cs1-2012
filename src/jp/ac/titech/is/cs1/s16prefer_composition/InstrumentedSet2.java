package jp.ac.titech.is.cs1.s16prefer_composition;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class InstrumentedSet2<E> extends SetAdapter<E>
implements InstrumentedSet<E> {
	private int addCount = 0;
	public int getCount() { return addCount; }
	
	public InstrumentedSet2(Set<E> s) { super(s); }
	public InstrumentedSet2() { this(new TreeSet<E>()); }
	
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}
}
