import sys

def determine_string(str):
    """
    Read the string from input and decide if it has unique letters
    """
    letters = [None]*256
    for c in str:
        print ord(c)
        if letters[ord(c)]:
            return False                        
        else:
            letters[ord(c)] = True  
    return True
 
def main():
    string = sys.argv[1]
    print determine_string(string)

if __name__ == "__main__":
    main()

