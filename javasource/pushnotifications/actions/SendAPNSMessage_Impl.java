// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package pushnotifications.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import pushnotifications.implementation.apns.APNSConnection;

public class SendAPNSMessage_Impl extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __message;
	private pushnotifications.proxies.Message message;
	private IMendixObject __settings;
	private pushnotifications.proxies.APNSSettings settings;

	public SendAPNSMessage_Impl(IContext context, IMendixObject message, IMendixObject settings)
	{
		super(context);
		this.__message = message;
		this.__settings = settings;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.message = this.__message == null ? null : pushnotifications.proxies.Message.initialize(getContext(), __message);

		this.settings = this.__settings == null ? null : pushnotifications.proxies.APNSSettings.initialize(getContext(), __settings);

		// BEGIN USER CODE
		APNSConnection apnsConnection = APNSConnection.getInstance();
		apnsConnection.sendMessage(settings, message);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SendAPNSMessage_Impl";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
