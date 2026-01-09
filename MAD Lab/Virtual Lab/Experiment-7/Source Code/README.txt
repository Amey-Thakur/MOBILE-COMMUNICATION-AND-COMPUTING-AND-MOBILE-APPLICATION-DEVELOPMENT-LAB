================================================================================
    EXPERIMENT 7: PACKET ANALYSIS USING WIRESHARK
    Mobile Application Development Lab
================================================================================

EXPERIMENT INFORMATION
----------------------
Title:          Analyze Packets using Wireshark
Experiment:     Experiment 7
Date:           September 17, 2021

Author:         Amey Thakur
GitHub:         https://github.com/Amey-Thakur
ORCID:          https://orcid.org/0000-0001-5644-1575
Repository:     https://github.com/Amey-Thakur/MOBILE-COMMUNICATION-AND-COMPUTING-AND-MOBILE-APPLICATION-DEVELOPMENT-LAB

Institution:    Terna Engineering College, Navi Mumbai
University:     University of Mumbai
Course:         Mobile Application Development Lab (CSL702)
Semester:       VII (Final Year, B.E. Computer Engineering)
Academic Year:  2021-2022

Software Used:  Wireshark Network Analyzer (v3.4.8), Npcap, USBPcap

================================================================================
EXPERIMENT DESCRIPTION
================================================================================

AIM:
To analyze network packets and protocols using Wireshark.

INTRODUCTION:
Wireshark is the world's foremost network protocol analyzer. It lets you see what's
happening on your network at a microscopic level. It is the de facto (and often
de jure) standard across many industries and educational institutions.

PROCEDURE:
1. Installation:
   - Download and install Wireshark (64-bit).
   - Install Npcap (Packet sniffing driver).
   - Install USBPcap (Optional, for USB packet capturing).

2. Packet Capture:
   - Open Wireshark.
   - Select the network interface to monitor (e.g., Wi-Fi, Ethernet).
   - Click "Start Capturing Packets" (Blue fin icon) or use key shortcut.
   - Browse the internet or generate network traffic to capture packets.
   - Click "Stop Capturing Packets" (Red square icon).

3. Analysis:
   - Apply Display Filters to view specific protocol packets (e.g., 'http', 'tcp', 'udp').
   - Inspect packet details including Source IP, Destination IP, Protocol, and Info.

================================================================================
QUIZ & DISCUSSION
================================================================================

Q1. Explain the procedure to capture packets.

    1. Open Wireshark. It displays a list of available network connections (interfaces).
    2. You can apply a 'Capture Filter' if you only want to capture specific traffic.
    3. Select one or more network interfaces (e.g., Wi-Fi) using "Shift + Left-Click".
    4. Click the first button on the toolbar "Start Capturing Packets" or select
       Capture -> Start.
    5. Wireshark will start showing captured packets in real-time.
    6. To stop, click the "Stop Capturing Packets" button or select Capture -> Stop.
    7. Save the capture file (.pcapng) if needed.

Q2. Which types of filters did you apply in Wireshark, explain in detail?
    
    Wireshark uses two types of filters:
    
    1. CAPTURE FILTERS:
       - Applied BEFORE starting the capture.
       - Limits the captured packets to the filter criteria. Packets not matching
         are discarded and not saved.
       - Example: 'port 53' (capture traffic on port 53 only).
       
    2. DISPLAY FILTERS:
       - Applied AFTER capture (or during view) to change the view of the capture.
       - Does not discard data; only hides it from view.
       - Allows you to filter down to narrow down the packets in the Packet List.
       - Example:
         - 'ip.src == [IP-Address]' : Show packets from a specific source IP.
         - 'http' : Show only HTTP protocol packets.

================================================================================
NOTE ON SOURCE CODE
================================================================================
This experiment involves the usage of an external tool (Wireshark) and analysis
of live network traffic. Therefore, there is no static source code associated
with this experiment. The output is a video demonstration located in the
parent directory (Experiment-7.avi).

================================================================================
LICENSE AND ATTRIBUTION
================================================================================

Academic Documentation: Amey Thakur
Year: 2021

================================================================================
                         © 2021 Amey Thakur | Terna Engineering College
================================================================================
