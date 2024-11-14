<template>
    <div>
        <el-container style="height: 700px; border: 1px solid #eee">
            <el-header style="font-size: 40px; background-color: rgb(238, 241, 246);">GS智能学习辅助系统</el-header>
            <el-container>
                <el-aside width="230px" style="border: 1px solid #eee">
                    <el-menu :default-openeds="['1', '3']">
                        <el-submenu index="1">
                            <template slot="title"><i class="el-icon-message"></i>系统信息管理</template>
                            <el-menu-item index="1-1">
                                <router-link to="/element">element</router-link>
                            </el-menu-item>
                            <el-menu-item index="1-2">
                                <router-link to="/emp">员工管理</router-link>
                            </el-menu-item>
                        </el-submenu>
                    </el-menu>
                </el-aside>
                <el-main>
                    <el-form :inline="true" :model="searchForm" class="demo-form-inline">
                        <el-form-item label="姓名">
                            <el-input v-model="searchForm.name" placeholder="姓名"></el-input>
                        </el-form-item>
                        <el-form-item label="性别">
                            <el-select v-model="searchForm.gender" placeholder="性别">
                                <el-option label="男" value="1"></el-option>
                                <el-option label="女" value="2"></el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item>
                            <el-button type="primary" @click="onSubmit">查询</el-button>
                        </el-form-item>
                        <el-form-item label="入职日期">
                            <div class="block">
                                <el-date-picker v-model="searchForm.entrydate" type="date" placeholder="选择日期">
                                </el-date-picker>
                            </div>
                        </el-form-item>
                    </el-form>
                    <br><br>
                    <el-table :data="tableData" border>
                        <el-table-column prop="id" label="序号" width="140">
                        </el-table-column>
                        <el-table-column prop="name" label="姓名" width="140">
                        </el-table-column>
                        <el-table-column label="性别" width="140">
                            <template slot-scope="scope">
                                {{ scope.row.gender == 1 ? '男' : '女' }}
                            </template>
                        </el-table-column>
                        <el-table-column prop="job" label="职位" width="140">
                        </el-table-column>
                        <el-table-column prop="entrydate" label="出生日期" width="140">
                        </el-table-column>
                        <el-table-column prop="updatetime" label="入职日期" width="140">
                        </el-table-column>
                    </el-table>
                    <br><br>

                    <el-pagination layout="total,sizes,prev, pager, next,jumper" @size-change="handleSizeChange"
                        @current-change="handleCurrentChange" :total="1000">
                    </el-pagination>
                </el-main>
            </el-container>
        </el-container>
    </div>
</template>

<script>
import axios from 'axios';

export default {
    data() {
        return {
            tableData: [],
            searchForm: {
                name: '',
                gender: '',
                entrydate: ''
            }
        }
    },
    methods: {
        onSubmit() {
            console.log('submit!');
        },
        handleSizeChange(val) {
            console.log(`每页 ${val} 条`);
        },
        handleCurrentChange(val) {
            console.log(`当前页: ${val}`);
        }
    },
    mounted() {
        axios.get("https://yapi.pro/mock/576565/user/getById").then((result) => {
            this.tableData = result.data.data;
        });
    },
}
</script>

<style></style>