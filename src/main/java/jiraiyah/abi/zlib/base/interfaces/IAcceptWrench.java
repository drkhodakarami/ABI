package jiraiyah.abi.zlib.base.interfaces;

public interface IAcceptWrench
{
    public void canUseWrench();
    public void wrenchAdded();
    public void wrenchRemoved();
    public void wrenchUsedOn();
    public void ejectWrench();
}