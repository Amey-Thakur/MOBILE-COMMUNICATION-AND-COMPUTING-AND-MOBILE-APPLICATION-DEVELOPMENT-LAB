# Virtual Lab Simulations

<div align="center">
  <img src="https://img.shields.io/badge/Virtual%20Lab-Interactive-orange?style=for-the-badge&logo=java" alt="Virtual Lab Badge" />
  <br>
  <b>Interactive Source Code & Simulations for Mobile Application Development</b>
</div>

---

## Overview

This **Virtual Lab Hub** provides access to the underlying source code and simulations for the experiments conducted in the Mobile Application Development Laboratory. It includes legacy Java Applets, NS2 Network Simulations, and Android Studio projects.

### Technologies Used

| Technology | Type | Experiments |
| :--- | :--- | :--- |
| **Java Applets** | Legacy Simulation | Exp 1, 2, 3, 4, 6, 8, 10 |
| **NS2 (TCL)** | Network Simulator | Exp 8 |
| **Wireshark** | Packet Analysis | Exp 7 |
| **Android** | Mobile App | Exp 9 |
| **Cisco Packet Tracer** | Network Config | Exp 10 |

---

## Experiment Index

| # | Experiment Name | Type | Status | Simulation / Source |
|:-:|:---|:---|:---:|:---|
| **1** | Path Loss | ☕ Java Applet | ✅ | [View Source](../Experiment-1/Source%20Code/) |
| **2** | Co-channel Interference | ☕ Java Applet | ✅ | [View Source](../Experiment-2/Source%20Code/) |
| **3** | Frequency Reuse | ☕ Java Applet | ✅ | [View Source](../Experiment-3/Source%20Code/) |
| **4** | Handover Mechanism | ☕ Java Applet | ✅ | [View Source](../Experiment-4/Source%20Code/) |
| **5** | WAP Form Validation | 🌐 WML / HTML | ✅ | [View Source](../Experiment-5/Source%20Code/) |
| **6** | Frequency Reuse (Part A & B) | ☕ Java Applet | ✅ | [View Source](../Experiment-6/Source%20Code/) |
| **7** | Packet Analysis | 📹 Video Demo | ✅ | [Watch Video](../Experiment-7/Source%20Code/Experiment-7.avi) |
| **8** | MANET Simulation | 📡 NS2 / Java | ✅ | [View Source](../Experiment-8/Source%20Code/) |
| **9** | Android Form Validation | 📱 Android Proj | ✅ | [View Source](../Experiment-9/Source%20Code/) |
| **10**| Wireless Access Points | 📶 Pkt Tracer | ✅ | [View Source](../Experiment-10/Source%20Code/) |

---

## How to Run

### ☕ Legacy Java Applets
*Note: Modern browsers no longer support Java Applets. You must use the `appletviewer` utility from the JDK.*
1.  Navigate to the `Source Code` directory of the experiment.
2.  Open a terminal.
3.  Run: `appletviewer <filename>.html` (e.g., `appletviewer Path_Loss.html`).

### 📡 NS2 Simulation (Experiment 8)
1.  Ensure **NS2** is installed (typically on Ubuntu/Linux).
2.  Navigate to the directory containing the `.tcl` file.
3.  Run: `ns <filename>.tcl`.
4.  Use **NAM (Network Animator)** to visualize the output if generated.

### 📱 Android Projects (Experiment 9)
1.  Open **Android Studio**.
2.  Select **Open an existing project**.
3.  Navigate to the `Source Code` directory.
4.  Build and Run on an Emulator.

---

<div align="center">
  <small>Curated by <a href="https://github.com/Amey-Thakur">Amey Thakur</a></small>
</div>
