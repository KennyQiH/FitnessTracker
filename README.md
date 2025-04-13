# FitnessTracker
Classes Done:
- User Class.

Classes Work in Progress:
- None.

Good news:
- Changes have made so that it uses multiple windows and it saves code

Bad news:
- To make use of the user class two more classes had to be made


## Class Diagram
```mermaid
%%{init: {'theme':'forest'}}%%
classDiagram
    JFrame <|-- FitnessGUI
    JPanel <|-- Workout 
    JPanel <|-- Goals
    JPanel <|-- Progress

    namespace Java {
        class JFrame {

        }
        class JPanel {

        }
    }
    namespace FitnessTrackerProject {
        class FitnessGUI {
        }
        class FitnessTracker {
        }
        class Goals {

        }
        class Progress {

        }
        class Workout {
        }
        class User {
        }
    }
```
