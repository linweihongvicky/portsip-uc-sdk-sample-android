# Welcome to PortSIP UC SDK for Android

PortSIP UC SDK is a **free SIP SDK** which allows you to create your SIP-based application for multiple platforms (iOS, Android, Windows, macOS and Linux) base on it.
**PortSIP UC SDK is free, but it is limited to work with [PortSIP PBX](https://www.portsip.com/portsip-pbx) only**

**If you are looking for a SIP SDK working with 3rd PBX or SIP server, please check our** [PortSIP VoIP SDK](https://github.com/portsip/portsip-voip-sdk-sample-for-android)

The PortSIP UC SDK is a powerful and versatile set of tools that dramatically accelerate SIP application development. It includes a suite of stacks, SDKs, and some Sample projects, each of which enables developers to combine all the necessary components to create an ideal development environment for every application's specific needs.

The PortSIP UC SDK complies with IETF and 3GPP standards, and is IMS-compliant (3GPP/3GPP2, TISPAN and PacketCable 2.0).
These high performance SDKs provide unified API layers for full user control and flexibility.


## Getting Started

You can checkout our UC SDK with SIPsample project source code by performing below command:<br><br>
```git clone https://github.com/portsip/portsip-uc-sdk-sample-android.git```

## Contents

 The sample package for downloading contains almost all of materials for PortSIP SDK: documentation,
 Dynamic/Static libraries, sources, headers, datasheet, and everything else a SDK user might
 need!


## SDK User Manual

 To be started with, it is recommended to read the documentation of PortSIP UC SDK, [SDK User Manual page](https://www.portsip.com/voip-sdk-user-manual/), which gives a brief
 description of each API function.


## Website

Some general interest or often changing PortSIP SDK information will be posted on the [PortSIP website](https://www.portsip.com) in real time. The release contains links to the site, so while browsing you may see occasional broken links if you are not connected to the Internet. To be sure everything needed for using the PortSIP UC SDK has been contained within the release.

## Support

Please send email to our <a href="mailto:support@portsip.com">Support team</a> if you need any help.

## Installation Prerequisites

To use PortSIP UC SDK for Android for development, SDK version with later than API-16 is required.

## Device Requirements


## Frequently Asked Questions
### 1. Is PortSIP UC SDK free of charge?

  Yes, the PortSIP UC SDK is totally free, but it is limited to work with <a href="https://www.portsip.com/portsip-pbx/" target="_blank">PortSIP PBX</a> only.

### 2. What is the difference between PortSIP UC SDK and PortSIP VoIP SDK?

  The <a href="https://www.portsip.com/portsip-uc-sdk/" target="_blank">PortSIP UC SDK</a> is free, but is limited to work with <a href="https://www.portsip.com/portsip-pbx/" target="_blank">PortSIP PBX</a> only; the <a href="https://www.portsip.com/portsip-pbx/" target="_blank">PortSIP VoIP SDK</a> is not free of charge and can work with any 3rd SIP based PBX. The UC SDK also provides a lot of unique features than the VoIP SDK which are provided by <a href="https://www.portsip.com/portsip-pbx/" target="_blank">PortSIP PBX</a>.

### 3. Where can I download the PortSIP UC SDK for test?

All sample projects of the **free PortSIP UC SDK** can be found and downloaded at github:
  <br>
```
git clone https://github.com/portsip/portsip-uc-sdk-sample-ios.git
   git clone https://github.com/portsip/portsip-uc-sdk-sample-android.git
   git clone https://github.com/portsip/portsip-uc-sdk-sample-mac.git
   git clone https://github.com/portsip/portsip-uc-sdk-sample-win.git
   git clone https://github.com/portsip/portsip-uc-sdk-sample-for-xamarin.git
```


### 4. How can I compile the sample project?

  1. Checkout the UC SDK and sample project from github.
  2. Open the project by your IDE.
  3. Compile the sample project directly.


### 5. How can I create a new project with PortSIP VoIP SDK?

  1. Checkout the Sample project from github to a local directory.
  2. Android Studio and create a new Android Application Project
  3. Copy all files form libs directory under extracted directory to the libs directory of your new application.
  4. Import the dependent class form the SDK. For example:
  ```
 			import com.portsip.OnPortSIPEvent;
			import com.portsip.PortSipSdk;
			```
  5. Inherit the interface ``` OnPortSIPEvent to process the callback events. ```
  6. Initialize SDK. For example:
  ```
			mPortSIPSDK = new PortSipSdk();
			mPortSIPSDK.setOnPortSIPEvent(instanceofOnPortSIPEvent);
			mPortSIPSDK.CreateCallManager(context);
			mPortSIPSDK.initialize(...);
```
			
  For more details, please read the Sample project source code.


### 6. Is the SDK thread safe?
Yes, the SDK is thread safe. You can call any of the API functions without the need to consider the multiple threads.
Note: the SDK allows to call API functions in callback events directly - except for the ``` "onAudioRawCallback"```, ```"onVideoRawCallback"```, ```"onReceivedRtpPacket"```, ```"onSendingRtpPacket"``` callbacks.

### 7. Does the SDK support native 64-bit?
Yes, both 32-bit and 64-bit are supported for SDK.

### 8. Does the SDK support VoIP PUSH?
Yes, please refer to <a href="https://www.portsip.com/knowledge-base/" target="_blank">https://www.portsip.com/knowledge-base/</a> for more details.
