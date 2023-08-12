package jiraiyah.abi.zlib.base.interfaces;

public interface IAcceptSpanner
{
    public void canUseSpanner();
    public void spannerAdded();
    public void spannerRemoved();
    public void spannerUsedOn();
    public void ejectSpanner();
}