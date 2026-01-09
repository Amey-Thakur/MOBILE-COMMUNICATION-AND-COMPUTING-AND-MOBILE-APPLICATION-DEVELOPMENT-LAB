================================================================================
    EXPERIMENT 8: WIRELESS NETWORK SIMULATION (MANET)
    Mobile Application Development Lab
================================================================================

EXPERIMENT INFORMATION
----------------------
Title:          Create a small wireless network (MANET) using NS2
Experiment:     Experiment 8
Date:           September 24, 2021

Author:         Amey Thakur
GitHub:         https://github.com/Amey-Thakur
ORCID:          https://orcid.org/0000-0001-5644-1575
Repository:     https://github.com/Amey-Thakur/MOBILE-COMMUNICATION-AND-COMPUTING-AND-MOBILE-APPLICATION-DEVELOPMENT-LAB

Institution:    Terna Engineering College, Navi Mumbai
University:     University of Mumbai
Course:         Mobile Application Development Lab (CSL702)
Semester:       VII (Final Year, B.E. Computer Engineering)
Academic Year:  2021-2022

Software Used:  NS2 (Network Simulator 2) on Ubuntu (VMware/VirtualBox)

================================================================================
EXPERIMENT DESCRIPTION
================================================================================

AIM:
A. Install Ubuntu in Virtual Box/VMware and Install NS2 on Ubuntu.
B. Create a small wireless network (MANET) using NS2.

FILES:
- pl.tcl                    : NS2 TCL script to simulate the network.
- Handoff_Simulation.html   : Legacy Java applet (Preserved file).
- Handoff_Simulation.jnlp   : Legacy Java configuration (Preserved file).
- old_Exp8_Handoff.jar      : Legacy Java Jar (Preserved file).

THEORY:
NS2 (Network Simulator 2) is an open-source event-driven simulator designed
specifically for research in computer communication networks. It is widely used
for simulating TCP, routing, and multicast protocols over wired and wireless
(local and satellite) networks.

MANET (Mobile Ad-hoc Network) is a decentralized type of wireless network using
mobile devices (nodes) that can join and leave the network dynamically.

CODE EXPLANATION (pl.tcl):
1.  Simulator Object: Created using `set ns [new Simulator]`.
2.  Colors: Blue and Red defined for data flows in NAM (Network Animator).
3.  Nodes: 4 nodes created (n0, n1, n2, n3).
4.  Links: Duplex links defined with bandwidth (2Mb/1.7Mb) and delay (10ms/20ms).
5.  Topology:
    n0 --\
          n2 --- n3
    n1 --/
6.  Agents:
    - TCP connection between n0 (Source) and n3 (Sink).
    - UDP connection between n1 (Source) and n3 (Null Sink).
7.  Applications:
    - FTP application attached to TCP agent.
    - CBR (Constant Bit Rate) traffic attached to UDP agent.

================================================================================
QUIZ & DISCUSSION
================================================================================

Q1. What is Virtualization? List out various virtualization Tools.

    Virtualization is the process of creating a software-based, or virtual,
    representation of something, such as virtual applications, servers,
    storage, and networks. It allows running multiple operating systems on a
    single physical machine.
    
    Tools:
    1. VMware Workstation
    2. Oracle VirtualBox
    3. Microsoft Hyper-V
    4. SolarWinds Virtualization Manager
    5. QEMU
    6. Parallel Desktops

Q2. What is NS2? Explain the architecture of NS2.

    NS2 (Network Simulator Version 2) is an open-source event-driven simulator
    designed specifically for research in computer communication networks.
    
    Key features:
    - Discrete event simulator.
    - Supports protocols like TCP, FTP, UDP, HTTP, DSR.
    - Simulates wired and wireless networks.
    
    Architecture:
    NS2 consists of two key languages:
    1.  C++: Defines the internal mechanism (backend) for speed and efficiency.
        Used for per-packet processing.
    2.  OTcl (Object-oriented Tool Command Language): Sets up simulation by
        assembling and configuring objects. Used for control and configuration.
    
    TclCL acts as the interface between C++ and OTcl.

================================================================================
LICENSE AND ATTRIBUTION
================================================================================

Academic Documentation: Amey Thakur
Year: 2021

================================================================================
                         © 2021 Amey Thakur | Terna Engineering College
================================================================================