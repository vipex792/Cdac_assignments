 for(int i = 0; i < itemCount; i++) {
            cout << purchasedItems[i].itemName << " - " << purchasedItems[i].price << endl;
            total += purchasedItems[i].price;
        }
        cout << "Total Amount = " << total << endl;