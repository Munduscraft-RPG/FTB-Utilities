package latmod.ftbu.api;

import com.google.gson.GsonBuilder;

public class EventFTBUGson extends EventLM
{
	public final GsonBuilder builder;
	
	public EventFTBUGson(GsonBuilder b)
	{ builder = b; }
	
	public void add(Class<?> c, Object o)
	{ builder.registerTypeHierarchyAdapter(c, o); }
}