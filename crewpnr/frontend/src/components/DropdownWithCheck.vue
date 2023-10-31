<template>
    <div class="custom-select">
        <div class="select-trigger" @click="toggleDropdown">
            <select>
                <!-- <option value="">{{ selectedOptions.length > 0 ? selectedOptions.join(', ') : 'All (Select options)' }} -->
                <option value="">{{ selectedOptions.length > 0 ? selectedOptions.map((item)=> item.label).join(', ') : 'All (Select options)' }}
                </option>
            </select>
        </div>
        <div class="dropdown" v-if="isDropdownOpen">
            <label v-for="option in options" :key="option.value" class="option">
                <input type="checkbox" :value="option" v-model="selectedOptions">
                {{ option.label }}
            </label>
        </div>
    </div>
</template>
  
<script>
export default {
    props: {
        options: {
            type: Array,
            required: true
        },
        bindedOptions: []
    },
    data() {
        return {
            // options: [
            //     // { value: 'option1', label: 'Option 1' },
            //     // { value: 'option2', label: 'Option 2' },
            //     // { value: 'option3', label: 'Option 3' },
            // ],
            isDropdownOpen: false,
            selectedOptions: []
        };
    },
    methods: {
        toggleDropdown() {
            console.log('selectedOptions', this.selectedOptions);
            this.isDropdownOpen = !this.isDropdownOpen;
            this.$emit('select', this.selectedOptions);
        }
    },
    mounted(){
        console.log('Dropdown mounted--------------');
        this.selectedOptions = this.bindedOptions;
    }
};
</script>
  
<style scoped>
.custom-select {
    position: relative;
}

.select-trigger {
    cursor: pointer;
    border: 1px solid #ccc;
    
}

.dropdown {
    /* display: none; */
    position: absolute;
    top: 100%;
    left: 0;
    width: 100%;
    background: #fff;
    border: 1px solid #ccc;
}

.option {
    display: block;
    padding: 1px;
    margin-left: 10px;
    height: 30px;
}

.option input {
    margin-right: 10px;
}
</style>
  