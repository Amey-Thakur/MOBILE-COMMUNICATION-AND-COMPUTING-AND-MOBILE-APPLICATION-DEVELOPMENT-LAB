================================================================================
    EXPERIMENT 10: WIRELESS ACCESS POINTS CONFIGURATION
    Mobile Application Development Lab
================================================================================

EXPERIMENT INFORMATION
----------------------
Title:          Set up and configuration of wireless Access Points
Experiment:     Experiment 10
Date:           October 08, 2021

Author:         Amey Thakur
GitHub:         https://github.com/Amey-Thakur
ORCID:          https://orcid.org/0000-0001-5644-1575
Repository:     https://github.com/Amey-Thakur/MOBILE-COMMUNICATION-AND-COMPUTING-AND-MOBILE-APPLICATION-DEVELOPMENT-LAB

Institution:    Terna Engineering College, Navi Mumbai
University:     University of Mumbai
Course:         Mobile Application Development Lab (CSL702)
Semester:       VII (Final Year, B.E. Computer Engineering)
Academic Year:  2021-2022

Software Used:  Cisco Packet Tracer (v8.0 64-bit)

================================================================================
EXPERIMENT DESCRIPTION
================================================================================

AIM:
Set up and configuration of wireless Access Points.

FILES:
- Experiment-10.avi         : Video demonstration (Located in parent directory).
- Frequency_Selective_Fading.html : Legacy Java applet (Preserved file).
- Frequency_Selective_Fading.jnlp : Legacy Java configuration (Preserved file).
- old_Frequency_Selective_Fading.jar: Legacy Java Jar (Preserved file).

THEORY:
A Wireless Access Point (WAP) is a networking hardware device that allows other
Wi-Fi devices to connect to a wired network. The AP usually connects to a router
(via a wired network) as a standalone device, but it can also be an integral
component of the router itself.

PROCEDURE (Using Cisco Packet Tracer):
1.  Installation:
    - Download and install Cisco Packet Tracer 8.0 (64-bit).
    - Accept the license agreement and choose destination setup.
    
2.  Setup and Configuration:
    - Launch Packet Tracer.
    - Select Network Devices -> Wireless Devices -> Access Point (AP-PT).
    - Place the Access Point in the workspace.
    - Select End Devices -> PC / Laptop.
    - Configure the Laptop to use a Wireless Interface (WPC300N) instead of
      the default Ethernet card.
      - Turn off the laptop physically in the simulation.
      - Remove the Ethernet module.
      - Insert the Linksys WPC300N module.
      - Turn on the laptop.
    - Configure the Access Point:
      - Set SSID (e.g., "Compass").
      - Set Authentication (WPA2-PSK) and Passphrase.
    - Connect Laptop to Access Point via PC Wireless Desktop App -> Connect tab.
    
3.  Verification:
    - Ensure connectivity between devices connected to the AP.
    - Use `ping` command to test connection.

================================================================================
QUIZ & DISCUSSION
================================================================================

Q1. Check out/make use of connection with your mobile.
    Ans:
    A. turn on & connect:
       - Open your device's Settings app.
       - Tap Network & internet > Internet.
       - Tap a listed network. Networks that require a password have a Lock.
    B. "Saved" Networks:
       - After you connect, the network is "Saved." When your phone is near and
         Wi-Fi is on, your phone automatically connects to this network.

Q2. What IEEE standard is used for AP?
    Ans: IEEE 802.11

Q3. How Adhoc Wireless LAN will be created?
    Ans:
    - Devices in the ad hoc network require a wireless network adapter or chip
      configured for ad hoc mode instead of infrastructure mode.
    - They need to be able to act as a wireless router when connected.

Q4. What is the difference between WLAN and WiMax?
    Ans:
    - WLAN is meant for short-range applications while WiMax is meant for
      long-range applications.
    - WLAN can deliver much faster speeds compared to WiMax.
    - WiMax provides a much better method of bandwidth distribution compared
      to WLAN. Both technologies are still susceptible to overloading.

================================================================================
LICENSE AND ATTRIBUTION
================================================================================

Academic Documentation: Amey Thakur
Year: 2021

================================================================================
                         © 2021 Amey Thakur | Terna Engineering College
================================================================================